package api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.ketellin.domain.dto.MovimentoManualRequest;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.math.BigDecimal;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
public class MovimentoManualControllerTest {


    private MockMvc mockMvc;

    private ObjectMapper objectMapper= new ObjectMapper();

    /*
    INCOMPLETO - CONCLUIR
     */
    @Test
    public void saveMovimentosTest() throws Exception{
        MovimentoManualRequest movManualTest = MovimentoManualRequest.builder()
                .codCosif("COSIF003")
                .codProduto("001")
                .datAno(2022)
                .datMes(1)
                .desDescricao("EXECUTANDO TESTE JUNIT")
                .valValor(new BigDecimal(345.44))
                .build();

        this.mockMvc.perform((post("/api/movimentos"))
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(movManualTest))
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk());

    }


}
