# Mars Rover Photos

## Monthly Challenge APP 00

### Posted on 07/11/2022

> Create an app that serves to list the image data gathered by NASA's, Curiosity, Opportunity, 
> and Spirit rovers on Mars
> 
>
>  Requirements:
> 
> * Use the API [mars-photo-api](https://mars-photos.herokuapp.com/explore/). 
> * [GITHUB](https://github.com/chrisccerami/mars-photo-api#querying-the-api)
> * The design is freely selectable. 
> * The list must be paginated. (up to 25 results)
> * The list will have a search filters.
> * When selecting a image from the list, the detail will show the data that it considers appropriate.

### Rover Cameras

|Abbreiviation  |Camera                         |Curiosity  |Opportunity    |Spirit |
|   -           |   -                           |   -       |   -           |   -   |
| FHAZ          | Front Hazard Avoidance Camera | &check;   | &check;       |&check;|
| RHAZ          | Rear Hazard Avoidance Camera  | &check;   | &check;       |&check;|
| MAST          | Mast Camera                   | &check;   |               |       |
| CHAMCAM       | Chemistry and Camera Complex  | &check;   |               |       |
| MAHLI         | Mars Hand Lens Imager         | &check;   |               |       |
| MARDI         | Mars Descent Imager           | &check;   |               |       |
| NAVCAM        | Navigation Camera             | &check;   | &check;       |&check;|
| PANCAM        | Panoramic Camera              |           | &check;       |&check;|
| MINITES       | Miniature Thermal Emission Spectrometer(Mini-TES) |   |&check;|&check;|

### Querying by Martian sol

|Parameter  |Type   |Default    |Description    |
|   -       |   -   |   -       |   -           |
| Sol       | int   | none      | sol (ranges from 0 to max found in endpoint |
| Camera    | string| all       | see table above for abbreviations |
| page      | int   | 1         | 25 items per page returned|

[**VIEW ALL CHALLENGES**](./)