package com.devmaster.services.mapper;

import java.util.List;

public interface EntityMapper<E,D>{
    E toEntity(D dto);

    List<E> toEntity(List<D> dto);

    D toDTO(E entity);

    List<D> toDTO(List<E> entity);
}
