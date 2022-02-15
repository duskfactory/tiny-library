package org.tinylibrary.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.tinylibrary.data.PatronDto;
import org.tinylibrary.entity.Patron;

import java.util.List;

@Mapper
public interface PatronMapper {
    PatronMapper INSTANCE = Mappers.getMapper(PatronMapper.class);

    PatronDto patronToPatronDto(Patron patron);

    Patron patronDtoToPatron(PatronDto patronDto);

    List<PatronDto> patronListToPatronDtoList(List<Patron> patronList);

    List<Patron> patronDtoListToPatronList(List<PatronDto> patronDtoList);
}
