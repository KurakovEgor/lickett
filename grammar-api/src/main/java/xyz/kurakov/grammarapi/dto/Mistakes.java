package xyz.kurakov.grammarapi.dto;

import lombok.Data;
import lombok.experimental.Accessors;
import xyz.kurakov.grammarapi.models.Mistake;

import java.util.List;

@Data
@Accessors(chain = true)
public class Mistakes {
    List<Mistake> list;
}
