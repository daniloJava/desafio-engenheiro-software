package br.com.itau.testeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.itau.testeservice.domain.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {

	/**
	 * TODO - Desenvolver um metodo para acessar o banco de dados e cadastrar uma Task
	 */

	/**
	 * TODO - Desenvolver um metodo para retornar todas as Task cadastradas no banco de dados.
	 */

	/**
	 * TODO - Desenvolver um metodo para deletar uma Task por id
	 */

}
