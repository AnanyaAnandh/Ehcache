@RestController
@RequestMapping("/number", MediaType.APPLICATION_JSON_UTF8_VALUE)
public class Ehcache {

    // ...

    @Autowired
    private NumberService numberService;

    @GetMapping(path = "/square/{number}")
    public String getSquare(@PathVariable Long number) {
        log.info("call numberService to square {}", number);
        return String.format("{\"square\": %s}", numberService.square(number));
    }
}