package com.AddressBook.Address.interfaces;

import com.AddressBook.Address.dto.AddressDTO;
import java.util.List;

public interface IAddressService {
    AddressDTO save(AddressDTO addressDTO);
    List<AddressDTO> getAll();
    AddressDTO getById(Long id);
    void delete(Long id);
}
