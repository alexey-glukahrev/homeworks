import Planes.ExperimentalPlane;
import models.ConfidentialLevel;
import models.ExperimentalType;
import models.MilitaryType;
import org.testng.annotations.Test;
import Planes.MilitaryPlane;
import Planes.PassengerPlane;
import Planes.Plane;

import java.util.*;
import java.util.stream.Collectors;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.everyItem;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;
import static org.hamcrest.number.OrderingComparison.lessThanOrEqualTo;

public class AirportTest {
    private static final PassengerPlane PLANE_WITH_MAX_PASSENGER_CAPACITY = new PassengerPlane("Boeing-747",
            980, 16100, 70500, 242);

    private static final List<Plane> planes = Arrays.asList(
            new PassengerPlane("Boeing-737", 900, 12000,
                    60500, 164),
            new PassengerPlane("Boeing-737-800", 940, 12300,
                    63870, 192),
            PLANE_WITH_MAX_PASSENGER_CAPACITY,
            new PassengerPlane("Airbus A320", 930, 11800,
                    65500, 188),
            new PassengerPlane("Airbus A330", 990, 14800,
                    80500, 222),
            new PassengerPlane("Embraer 190", 870, 8100,
                    30800, 64),
            new PassengerPlane("Sukhoi Superjet 100", 870, 11500,
                    50500, 140),
            new PassengerPlane("Bombardier CS300", 920, 11000,
                    60700, 196),
            new MilitaryPlane("B-1B Lancer", 1050, 21000,
                    80000, MilitaryType.BOMBER),
            new MilitaryPlane("B-2 Spirit", 1030, 22000,
                    70000, MilitaryType.BOMBER),
            new MilitaryPlane("B-52 Stratofortress", 1000, 20000,
                    80000, MilitaryType.BOMBER),
            new MilitaryPlane("F-15", 1500, 12000,
                    10000, MilitaryType.FIGHTER),
            new MilitaryPlane("F-22", 1550, 13000,
                    11000, MilitaryType.FIGHTER),
            new MilitaryPlane("C-130 Hercules", 650, 5000,
                    110000, MilitaryType.TRANSPORT),
            new ExperimentalPlane("Bell X-14", 277, 482,
                    500, ExperimentalType.HIGH_ALTITUDE, ConfidentialLevel.SECRET),
            new ExperimentalPlane("Ryan X-13 Vertijet", 560, 307,
                    500, ExperimentalType.VERTICAL_TAKE_OFF_AND_LANDING, ConfidentialLevel.TOP_SECRET)
    );

    @Test
    public void testGetTransportMilitaryPlanes() {
        Airport airport = new Airport(planes);
        List<MilitaryPlane> transportMilitaryPlanes = airport.getMilitaryPlanesWithTransportType();
        List<MilitaryType> transportMilitaryTypes = transportMilitaryPlanes.stream()
                .map(MilitaryPlane::getMilitaryType).collect(Collectors.toList());
        assertThat(transportMilitaryTypes, everyItem(is(MilitaryType.TRANSPORT)));
    }

    @Test
    public void testGetPassengerPlaneWithMaxCapacity() {
        Airport airport = new Airport(planes);
        PassengerPlane passengerPlaneWithMaxPassengersCapacity = airport.getPassengerPlaneWithMaxPassengersCapacity();
        assertThat(passengerPlaneWithMaxPassengersCapacity, equalTo(PLANE_WITH_MAX_PASSENGER_CAPACITY));
    }

    @Test
    public void testSortByMaxLoadCapacity() {
        Airport airport = new Airport(planes);
        airport.sortByMaxLoadCapacity();
        List<? extends Plane> planesSortedByMaxLoadCapacity = airport.getPlanes();
        for (int i = 0; i < planesSortedByMaxLoadCapacity.size() - 1; i++) {
            Plane currentPlane = planesSortedByMaxLoadCapacity.get(i);
            Plane nextPlane = planesSortedByMaxLoadCapacity.get(i + 1);
            assertThat(currentPlane.getMaxLoadCapacity(), lessThanOrEqualTo(nextPlane.getMaxLoadCapacity()));
        }
    }

    @Test
    public void testGetMilitaryPlanesWithBomberType() {
        Airport airport = new Airport(planes);
        List<MilitaryPlane> bomberMilitaryPlanes = airport.getMilitaryPlanesWithBomberType();
        List<MilitaryType> bomberMilitaryTypes = bomberMilitaryPlanes.stream()
                .map(MilitaryPlane::getMilitaryType).collect(Collectors.toList());
        assertThat(bomberMilitaryTypes, everyItem(is(MilitaryType.BOMBER)));
    }

    @Test
    public void testExperimentalPlanesHasClassificationLevelHigherThanUnclassified(){
        Airport airport = new Airport(planes);
        List<ExperimentalPlane> experimentalPlanes = airport.getExperimentalPlanes();
        List<ConfidentialLevel> confidentialLevelsExperimentalPlanes = experimentalPlanes.stream()
                .map(ExperimentalPlane::getConfidentialLevel).collect(Collectors.toList());
        assertThat(confidentialLevelsExperimentalPlanes, everyItem(is(not(ConfidentialLevel.UNCLASSIFIED))));
    }
}
