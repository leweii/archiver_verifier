package verifier.thirdparty;

import org.springframework.stereotype.Service;
import verifier.entity.Item;

import java.util.ArrayList;
import java.util.List;

@Service
public class DataReaderService {

    public List<Item> readItems() {
        List<Item> items = new ArrayList<>();

        return items;
    }
}
