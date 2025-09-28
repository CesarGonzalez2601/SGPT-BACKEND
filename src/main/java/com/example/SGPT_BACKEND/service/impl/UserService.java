package com.example.SGPT_BACKEND.service.impl;

import com.example.SGPT_BACKEND.model.dto.Pagination;
import com.example.SGPT_BACKEND.model.dto.users.UsersRQ;
import com.example.SGPT_BACKEND.model.dto.users.UsersRS;
import com.example.SGPT_BACKEND.model.entities.Users;
import com.example.SGPT_BACKEND.model.mappers.IUsersMapper;
import com.example.SGPT_BACKEND.repository.IUserRepository;
import com.example.SGPT_BACKEND.service.interfaces.IUserService;
import jakarta.persistence.EntityNotFoundException;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService implements IUserService {

    @Autowired
    public IUserRepository usersRepository;
    @Autowired
    public IUserRepository userRepository;
    @Autowired
    public IUsersMapper usersMapper;

    @Override
    public UsersRS save(UsersRQ entity) {
        Users user = usersMapper.requestToEntity(entity);
        Users savedUser = usersRepository.save(user);
        return usersMapper.entityToResponse(savedUser);
    }

    @Override
    public UsersRS getById(Integer integer) {

        Users users = usersRepository.findById(integer).
                orElseThrow(() -> new  EntityNotFoundException("No se encontraron registros"));
        return usersMapper.entityToResponse(users);

    }

    @Override
    public Pagination<UsersRS> getAll(Integer pagina, Integer cantidadElementos, String filtro) {
        return null;
    }

    @Override
    public UsersRS update(Integer integer, UsersRQ entity) {
        Users users = usersRepository.findById(integer).
                orElseThrow(() -> new  EntityNotFoundException("No se encontraron registros"));

        Users projectsUpdated = usersMapper.update(entity, users);

        return usersMapper.entityToResponse(projectsUpdated);
    }

    @Override
    public UsersRS deleteLogico(Integer integer) {
        return null;
    }

    @Override
    public UsersRS getByLogin(UsersRQ usersRQ) {

        Users users = usersRepository.findByEmailAndPassword(usersRQ.getEmail(), usersRQ.getPassword());

        if (users == null){
            throw new EntityNotFoundException("Credenciales incorrectas");
        }

        return usersMapper.entityToResponse(users);
    }

    @Override
    public List<UsersRS> getByAll() {

        List<Users> usersList = usersRepository.findAll();

        if (usersList.isEmpty()){
            throw new EntityNotFoundException("No se encontraron resultados");
        }


        return usersMapper.entityListToResponseList(usersList);
    }

    @Override
    public List<UsersRS> getByAllByProject(Integer idProject) {

        List<Users> usersList = usersRepository.findAllByProject(idProject);

        if (usersList.isEmpty()){
            throw new EntityNotFoundException("No se encontraron registros");
        }
        return usersMapper.entityListToResponseList(usersList);

    }
}
