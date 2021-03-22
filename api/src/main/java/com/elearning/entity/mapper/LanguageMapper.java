package com.elearning.entity.mapper;

import com.elearning.entity.Language;
import com.elearning.entity.dto.LanguageDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface LanguageMapper {

    LanguageMapper INSTANCE = Mappers.getMapper( LanguageMapper.class );

    LanguageDTO languageToLanguageDto(Language language);
    Language languageDtoToLanguage(LanguageDTO languageDTO);

}
