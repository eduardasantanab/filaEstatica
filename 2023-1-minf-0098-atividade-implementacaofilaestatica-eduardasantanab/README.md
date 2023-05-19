[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-c66648af7eb3fe8bc4f294546bfd86ef473780cde1dea487d3c4ff354943c9ae.svg)](https://classroom.github.com/online_ide?assignment_repo_id=10493017&assignment_repo_type=AssignmentRepo)
# Atividade de Apresentação
<img src="assets/images/Unicap_Icam_Tech-01.png" alt="drawing" width="250"/>

## Identificação
**Disciplina**: Estrutura de Dados I
\
**Atividade**: Implementação Fila
- [@mjcea - Prof. Marcos Canêjo](marcos.azevedo@unicap.br)

## Instruções
- Sua implementação deve estar dentro da pasta src/**main**/java 
- Não modifique nenhum código dentro da pasta src/**test**/java
- *Commits* fora do prazo **serão completamente desconsiderados**

##  Descrição
Implemente a estrutura de dados ``Fila`` de acordo com a seguinte assinatura:
```java
public class FilaEstatica {
  public Integer[] elementos;
  private Integer primeiro;
  private Integer ultimo;

  public FilaEstatica(int tamanho){}
  
  public void enqueue(Integer valor){}
  public boolean isFull(){}
  public Integer dequeue(){}
  public boolean isEmpty(){}
}
```

## Dúvidas?
- Utilize a seção de **comentários no Classroom**, pois sua dúvida pode ser a de mais alguém;
- **[Email](marcos.azevedo@unicap.br)** deve ser utilizado apenas para reportar bugs nos testes.
