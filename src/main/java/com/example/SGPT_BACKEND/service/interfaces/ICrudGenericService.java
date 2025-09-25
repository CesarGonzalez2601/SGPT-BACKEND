package com.example.SGPT_BACKEND.service.interfaces;


import com.example.SGPT_BACKEND.model.dto.Pagination;
import org.springframework.transaction.annotation.Transactional;
import java.io.Serializable;

@Transactional(readOnly = true)
public interface ICrudGenericService<T, ID extends Serializable, RQ, RS> {
    // Crear un nuevo objeto
    @Transactional
    RS save(RQ entity);

    // Obtener un objeto por su ID
    RS getById(ID id);

    // Obtener todos los objetos paginados
    Pagination<RS> getAll(Integer pagina, Integer cantidadElementos, String filtro);

    // Actualizar un objeto existente
    @Transactional
    RS update(ID id, RQ entity);

    // Patch de un objeto
    @Transactional
    RS deleteLogico(ID id);
}
