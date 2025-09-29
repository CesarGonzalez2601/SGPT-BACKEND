package com.example.SGPT_BACKEND.service.impl;

import com.example.SGPT_BACKEND.model.dto.Pagination;
import com.example.SGPT_BACKEND.model.dto.status.StatusRQ;
import com.example.SGPT_BACKEND.model.dto.status.StatusRS;
import com.example.SGPT_BACKEND.model.dto.users.UsersRQ;
import com.example.SGPT_BACKEND.model.dto.users.UsersRS;
import com.example.SGPT_BACKEND.model.entities.Status;
import com.example.SGPT_BACKEND.model.entities.Users;
import com.example.SGPT_BACKEND.model.mappers.IStatusMapper;
import com.example.SGPT_BACKEND.model.mappers.IUsersMapper;
import com.example.SGPT_BACKEND.repository.IStatusRepository;
import com.example.SGPT_BACKEND.repository.IUserRepository;
import com.example.SGPT_BACKEND.service.interfaces.IStatusService;
import com.example.SGPT_BACKEND.service.interfaces.IUserService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StatusService implements IStatusService {

    @Autowired
    private IStatusRepository statusRepository;
    @Autowired
    private IStatusMapper statusMapper;


    @Override
    public StatusRS save(StatusRQ entity) {

        Status status = statusMapper.requestToEntity(entity);
        status.setStatusName(entity.getStatusName());
        return statusMapper.entityToResponse(statusRepository.save(status));
    }

    @Override
    public StatusRS getById(Integer integer) {
        return null;
    }

    @Override
    public Pagination<StatusRS> getAll(Integer pagina, Integer cantidadElementos, String filtro) {
        return null;
    }

    @Override
    public StatusRS update(Integer integer, StatusRQ entity) {
        return null;
    }

    @Override
    public StatusRS deleteLogico(Integer integer) {
        return null;
    }
}
