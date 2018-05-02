package com.yingzi.center.breeding.service.query;

import com.dtyunxi.dto.ResponseDto;
import com.github.pagehelper.PageInfo;
import com.yingzi.center.breeding.dto.EntryToBhDto;
import com.yingzi.center.breeding.dto.EntryToBhRequestDto;

/**
 * @author hpx
 * @Date 2018/4/24
 */
public interface IEntryToBhQueryService {
    /**
     * 分页查询
     * @param request
     * @return
     */
    ResponseDto<PageInfo<EntryToBhDto>> queryPageUser(EntryToBhRequestDto request);

    /**
     * 通过id查询
     * @param entryToBhId
     * @return
     */
    ResponseDto<EntryToBhDto> queryDetailById(Long entryToBhId);
}
