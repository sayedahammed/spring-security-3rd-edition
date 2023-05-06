package com.security.calender.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Calendar;


/**
 * An {@link Event} is an item on a calendar that contains an owner (the person who created it), an attendee
 * (someone who was invited to the event), when the event will occur, a summary, and a description. For simplicity, all
 * fields are required.
 *
 * @author Rob Winch
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Event {

    private Integer id;
    @NotEmpty(message = "Summary is required")
    private String summary;
    @NotEmpty(message = "Description is required")
    private String description;
    @NotNull(message = "When is required")
    private Calendar whenTime;
    @NotNull(message = "Summary is required")
    private CalendarUser owner;
    private CalendarUser attendee;

} // The End...
