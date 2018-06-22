package com.container;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//import com.component.UserComponent;

public class Container {

	public void handleAllRequests(String url) {

		// ---------------------------------------------

		// UserComponent userComponent = new UserComponent();
		// if (url.equals("/login")) {
		// userComponent.doLogin();
		// }

		// ---------------------------------------------

		try {
			Class<?> clazz
			= Class.forName("com.component.UserComponent");
			Object comp = clazz.newInstance();

			Method[] methods = clazz.getMethods();
			for (Method method : methods) {
				RequestMapping rm = null;
				rm = method.getAnnotation(RequestMapping.class);
				if (rm != null) {
					String givenUrl = rm.url();
					if (givenUrl.equals(url)) {
						method.invoke(comp, new Object[] { "user1", "secret" });
					}
				}
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}

	}

}
