package com.corujeira.sacola.service;

import com.corujeira.sacola.model.Item;
import com.corujeira.sacola.resource.dto.ItemDto;
import com.corujeira.sacola.model.Sacola;

public interface SacolaService {
  Item incluirItemNaSacola(ItemDto itemDto);
  Sacola verSacola(Long id);
  Sacola fecharSacola(Long id, int formaPagamento);
}
