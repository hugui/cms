package cc.mrbird.system.controller;

import cc.mrbird.common.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Mr.HuGui
 * @date 2018-06-22 14:53
 */
@Controller
public class ActivityController extends BaseController {
    @RequestMapping("activity")
    //@RequiresPermissions("activity:list")
    public String index(Model model) {

        return "system/activity/index";
    }
}
