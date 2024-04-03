package rocketseat.com.passin.dto.event;

// record: usado para transferencia/representacao de dados
public record EventDetailDTO(String id,
                             String title,
                             String details,
                             String slug,
                             Integer maximumAttendees,
                             Integer attendeesAmount
) {
}
