package com.turkcell.TurkcellCRM.customerService.business.abstracts;


import com.turkcell.TurkcellCRM.customerService.dtos.request.create.CreateCustomerRequest;
import com.turkcell.TurkcellCRM.customerService.dtos.request.update.UpdateCustomerRequest;
import com.turkcell.TurkcellCRM.customerService.dtos.response.create.CreateCustomerResponse;
import com.turkcell.TurkcellCRM.customerService.dtos.response.get.GetAllCustomerResponse;
import com.turkcell.TurkcellCRM.customerService.dtos.response.get.GetCustomerResponse;
import com.turkcell.TurkcellCRM.customerService.dtos.response.update.UpdateCustomerResponse;

import java.util.List;

public interface CustomerService {
    //todo response ve request yaz
    CreateCustomerResponse add(CreateCustomerRequest customer);
    void delete(int id);
    GetCustomerResponse getById(int id);
    UpdateCustomerResponse update(UpdateCustomerRequest updateCustomerRequest, int customerId);
    List<GetAllCustomerResponse> getAll();
}
