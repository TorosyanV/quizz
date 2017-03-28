package info.fonis.service;

import info.fonis.service.dto.ResultCreateDto;

/**
 * Created by vazgent on 3/28/2017.
 */
public interface ResultService {
    Long createResult(ResultCreateDto resultCreateDto);
}
