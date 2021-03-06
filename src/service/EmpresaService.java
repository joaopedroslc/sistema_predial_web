package service;

import model.Empresa;

import java.util.ArrayList;

import dao.EmpresaDAO;


public class EmpresaService {
	EmpresaDAO dao = new EmpresaDAO();
	
	public int criar(Empresa empresa) {
		return dao.criar(empresa);
	}
	
	public void atualizar(Empresa empresa){
		dao.atualizar(empresa);
	}
	
	public void excluir(int id){
		dao.excluir(id);
	}
	
	public Empresa carregar(int id){
		return dao.carregar(id);
	}
	
	public ArrayList<Empresa> select(){
		return dao.carregaTodos();
	}
 
}
