package org.m2sec.abilities.menus;

import burp.api.montoya.MontoyaApi;
import org.m2sec.core.common.Config;

import java.util.List;

/**
 * @author: outlaws-bai
 * @date: 2024/7/13 10:54
 * @description:
 */

public class HttpHookTestMenu extends IMenu {
    public HttpHookTestMenu(MontoyaApi api, Config config) {
        super(api, config);
    }

    @Override
    public String displayName() {
        return "Http hook";
    }

    @Override
    public List<IMenu> getSubMenus() {
        return null;
    }

    @Override
    public List<IItem> getSubItems() {
        return null;
    }
}
