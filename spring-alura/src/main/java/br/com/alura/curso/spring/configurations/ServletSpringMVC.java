package br.com.alura.curso.spring.configurations;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ServletSpringMVC extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Adicionar as classes de configuração do projeto
	 * @return
	 */
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {AppWebConfiguration.class};
	}

	/**
	 * URL's que serão atendidas pelo Spring MVC
	 */
	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}

}
