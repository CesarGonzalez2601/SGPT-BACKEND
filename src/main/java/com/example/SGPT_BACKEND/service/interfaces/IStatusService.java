package com.example.SGPT_BACKEND.service.interfaces;

import com.example.SGPT_BACKEND.model.dto.status.StatusRQ;
import com.example.SGPT_BACKEND.model.dto.status.StatusRS;
import com.example.SGPT_BACKEND.model.dto.users.UsersRQ;
import com.example.SGPT_BACKEND.model.dto.users.UsersRS;
import com.example.SGPT_BACKEND.model.entities.Status;
import com.example.SGPT_BACKEND.model.entities.Users;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IStatusService extends ICrudGenericService<Status, Integer, StatusRQ, StatusRS>{

}
