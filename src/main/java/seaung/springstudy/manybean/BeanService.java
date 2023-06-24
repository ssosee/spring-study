package seaung.springstudy.manybean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BeanService {

    private final List<BeanParent> beans;
    private final Map<String, BeanParent> beanMap;

    @Autowired
    public BeanService(List<BeanParent> beans, Map<String, BeanParent> beanMap) {
        this.beans = beans;
        this.beanMap = beanMap;
        System.out.println("beans = " + beans);
        System.out.println("beanMap = " + beanMap);
    }

    public void printBean() {
        BeanParent bean1 = beanMap.get("bean1");
        BeanParent bean2 = beanMap.get("bean2");
        bean1.print();
        bean2.print();

        for(BeanParent bp : beans) {
            bp.print();
        }
    }

}
