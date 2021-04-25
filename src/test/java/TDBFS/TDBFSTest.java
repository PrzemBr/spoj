package TDBFS;

import org.junit.jupiter.api.*;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TDBFSTest {

    @Mock
    private Graph mockedGraph;

    @Mock
    private Vertex mockedVertx;

    @BeforeAll
    public void setMocks() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    @DisplayName("ShouldCheckGeneralInputMethod")
    void shouldCheckGeneralInputMethod() {
        final InputStream systemIn = System.in;
        final String testInput = "0 1 2 3";
        final ArrayList<Integer> testOutput = new ArrayList<>() {{
            add(0);
            add(1);
            add(2);
            add(3);
        }};

        try {
            Input input = new Input();
            System.setIn(new ByteArrayInputStream(testInput.getBytes()));
            ArrayList<Integer> outputList = input.genericInput();
            assertEquals(testOutput, outputList);
        } finally {
            System.setIn(systemIn);
        }
    }

    @Test
    @DisplayName("ShouldTestSearchTheGraphMetod")
    public void shouldTestSearchTheGraphMetod() {
        mockedGraph.searchTheGraph();
        verify(mockedGraph,times(1)).searchTheGraph();
    }

}