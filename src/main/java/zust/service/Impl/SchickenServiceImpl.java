package zust.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zust.dao.SChickenMapper;
import zust.model.SChicken;
import zust.service.SchickenService;

import java.util.List;

@Service
public class SchickenServiceImpl implements SchickenService {

    @Autowired
    SChickenMapper sChickenMapper;

    public PageInfo<SChicken> selectByTime(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<SChicken> list = sChickenMapper.selectByTime();
        PageInfo<SChicken> p = new PageInfo<SChicken>(list);
        return p;
    }

    public List<SChicken> selectBYTIME(){
        return sChickenMapper.selectByTime();
    }

    public SChicken selectByPK(int id) {
        return sChickenMapper.selectByPrimaryKey(id);
    }
}
