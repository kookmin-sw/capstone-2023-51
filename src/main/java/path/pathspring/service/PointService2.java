package path.pathspring.service;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;
import path.pathspring.domain.Point;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PointService2 {
    private Map<Integer, List<DijkstraAlgorithm.Edge>> graph;

    @PostConstruct
    public void createNewMap(){
        System.out.println("createNewMap");
        graph = new HashMap<>();
        graph.put(0, Arrays.asList(new DijkstraAlgorithm.Edge(1, 5), new DijkstraAlgorithm.Edge(2, 3)));
        graph.put(1, Arrays.asList(new DijkstraAlgorithm.Edge(3, 7)));
        graph.put(2, Arrays.asList(new DijkstraAlgorithm.Edge(1, 2), new DijkstraAlgorithm.Edge(3, 8)));
        graph.put(3, Arrays.asList(new DijkstraAlgorithm.Edge(4, 2)));
        graph.put(4, Arrays.asList(new DijkstraAlgorithm.Edge(0, 4)));
        graph.put(4001, Arrays.asList(new DijkstraAlgorithm.Edge(4010, 2)));
        graph.put(4010, Arrays.asList(new DijkstraAlgorithm.Edge(4001, 2), new DijkstraAlgorithm.Edge(438, 1), new DijkstraAlgorithm.Edge(4020, 2)));
        graph.put(4020, Arrays.asList(new DijkstraAlgorithm.Edge(4010, 1), new DijkstraAlgorithm.Edge(4011, 1), new DijkstraAlgorithm.Edge(4021, 1)));
        graph.put(4021, Arrays.asList(new DijkstraAlgorithm.Edge(4020, 1), new DijkstraAlgorithm.Edge(6006, 10), new DijkstraAlgorithm.Edge(7006, 10), new DijkstraAlgorithm.Edge(3002, 10)));
        graph.put(438, Arrays.asList(new DijkstraAlgorithm.Edge(4010, 2), new DijkstraAlgorithm.Edge(439, 1)));
        graph.put(439, Arrays.asList(new DijkstraAlgorithm.Edge(440, 1), new DijkstraAlgorithm.Edge(438, 1)));
        graph.put(440, Arrays.asList(new DijkstraAlgorithm.Edge(441, 1), new DijkstraAlgorithm.Edge(439, 1)));
        graph.put(441, Arrays.asList(new DijkstraAlgorithm.Edge(440, 1)));
        graph.put(4011, Arrays.asList(new DijkstraAlgorithm.Edge(4020, 2), new DijkstraAlgorithm.Edge(433, 1), new DijkstraAlgorithm.Edge(401, 1), new DijkstraAlgorithm.Edge(403, 1)));
        graph.put(433, Arrays.asList(new DijkstraAlgorithm.Edge(4011, 1), new DijkstraAlgorithm.Edge(434, 1)));
        graph.put(434, Arrays.asList(new DijkstraAlgorithm.Edge(433, 1), new DijkstraAlgorithm.Edge(435, 1)));
        graph.put(435, Arrays.asList(new DijkstraAlgorithm.Edge(436, 1), new DijkstraAlgorithm.Edge(434, 1)));
        graph.put(436, Arrays.asList(new DijkstraAlgorithm.Edge(435, 1), new DijkstraAlgorithm.Edge(437, 1)));
        graph.put(401, Arrays.asList(new DijkstraAlgorithm.Edge(4011, 1), new DijkstraAlgorithm.Edge(402, 1)));
        graph.put(402, Arrays.asList(new DijkstraAlgorithm.Edge(401, 1)));
        graph.put(437, Arrays.asList(new DijkstraAlgorithm.Edge(436, 1)));
        graph.put(403, Arrays.asList(new DijkstraAlgorithm.Edge(4011, 2), new DijkstraAlgorithm.Edge(404, 1)));
        graph.put(404, Arrays.asList(new DijkstraAlgorithm.Edge(403, 1), new DijkstraAlgorithm.Edge(405, 1)));
        graph.put(405, Arrays.asList(new DijkstraAlgorithm.Edge(404, 1), new DijkstraAlgorithm.Edge(4012, 1)));
        graph.put(4012, Arrays.asList(new DijkstraAlgorithm.Edge(405, 1), new DijkstraAlgorithm.Edge(430, 1), new DijkstraAlgorithm.Edge(406, 1)));
        graph.put(430, Arrays.asList(new DijkstraAlgorithm.Edge(4012, 1), new DijkstraAlgorithm.Edge(431, 1)));
        graph.put(431, Arrays.asList(new DijkstraAlgorithm.Edge(432, 1), new DijkstraAlgorithm.Edge(430, 1)));
        graph.put(432, Arrays.asList(new DijkstraAlgorithm.Edge(431, 1), new DijkstraAlgorithm.Edge(4013, 1)));
        graph.put(4013, Arrays.asList(new DijkstraAlgorithm.Edge(432, 1), new DijkstraAlgorithm.Edge(449, 1), new DijkstraAlgorithm.Edge(4015, 1)));
        graph.put(4015, Arrays.asList(new DijkstraAlgorithm.Edge(4013, 1), new DijkstraAlgorithm.Edge(448, 1), new DijkstraAlgorithm.Edge(630, 10), new DijkstraAlgorithm.Edge(729, 10)));
        graph.put(449, Arrays.asList(new DijkstraAlgorithm.Edge(4013, 1), new DijkstraAlgorithm.Edge(448, 1)));
        graph.put(448, Arrays.asList(new DijkstraAlgorithm.Edge(449, 1), new DijkstraAlgorithm.Edge(447, 1), new DijkstraAlgorithm.Edge(4015, 1)));
        graph.put(447, Arrays.asList(new DijkstraAlgorithm.Edge(448, 1), new DijkstraAlgorithm.Edge(4014, 1)));
        graph.put(4014, Arrays.asList(new DijkstraAlgorithm.Edge(447, 1), new DijkstraAlgorithm.Edge(424, 1), new DijkstraAlgorithm.Edge(4016, 1)));
        graph.put(424, Arrays.asList(new DijkstraAlgorithm.Edge(4014, 1), new DijkstraAlgorithm.Edge(422, 1)));
        graph.put(422, Arrays.asList(new DijkstraAlgorithm.Edge(424, 1), new DijkstraAlgorithm.Edge(420, 1)));
        graph.put(420, Arrays.asList(new DijkstraAlgorithm.Edge(422, 1), new DijkstraAlgorithm.Edge(4017, 1)));
        graph.put(4017, Arrays.asList(new DijkstraAlgorithm.Edge(420, 1), new DijkstraAlgorithm.Edge(411, 1), new DijkstraAlgorithm.Edge(4019, 1)));
        graph.put(406, Arrays.asList(new DijkstraAlgorithm.Edge(4012, 1), new DijkstraAlgorithm.Edge(407, 1)));
        graph.put(407, Arrays.asList(new DijkstraAlgorithm.Edge(406, 1), new DijkstraAlgorithm.Edge(408, 1)));
        graph.put(408, Arrays.asList(new DijkstraAlgorithm.Edge(407, 1), new DijkstraAlgorithm.Edge(409, 1)));
        graph.put(409, Arrays.asList(new DijkstraAlgorithm.Edge(408, 1), new DijkstraAlgorithm.Edge(410, 1)));
        graph.put(410, Arrays.asList(new DijkstraAlgorithm.Edge(409, 1), new DijkstraAlgorithm.Edge(411, 1)));
        graph.put(411, Arrays.asList(new DijkstraAlgorithm.Edge(410, 1), new DijkstraAlgorithm.Edge(4017, 1)));
        graph.put(4016, Arrays.asList(new DijkstraAlgorithm.Edge(4014, 1), new DijkstraAlgorithm.Edge(4018, 1), new DijkstraAlgorithm.Edge(446, 1), new DijkstraAlgorithm.Edge(6002, 10), new DijkstraAlgorithm.Edge(7004, 10), new DijkstraAlgorithm.Edge(3007, 10)));
        graph.put(4018, Arrays.asList(new DijkstraAlgorithm.Edge(4016, 1), new DijkstraAlgorithm.Edge(419, 1), new DijkstraAlgorithm.Edge(445, 1)));
        graph.put(446, Arrays.asList(new DijkstraAlgorithm.Edge(4016, 1), new DijkstraAlgorithm.Edge(419, 1), new DijkstraAlgorithm.Edge(445, 1)));
        graph.put(419, Arrays.asList(new DijkstraAlgorithm.Edge(4018, 1), new DijkstraAlgorithm.Edge(446, 1), new DijkstraAlgorithm.Edge(418, 1)));
        graph.put(418, Arrays.asList(new DijkstraAlgorithm.Edge(419, 1), new DijkstraAlgorithm.Edge(417, 1)));
        graph.put(417, Arrays.asList(new DijkstraAlgorithm.Edge(418, 1), new DijkstraAlgorithm.Edge(416, 1)));
        graph.put(416, Arrays.asList(new DijkstraAlgorithm.Edge(417, 1), new DijkstraAlgorithm.Edge(415, 1)));
        graph.put(415, Arrays.asList(new DijkstraAlgorithm.Edge(416, 1), new DijkstraAlgorithm.Edge(4019, 1)));
        graph.put(4019, Arrays.asList(new DijkstraAlgorithm.Edge(415, 1), new DijkstraAlgorithm.Edge(4017, 1), new DijkstraAlgorithm.Edge(412, 1)));
        graph.put(412, Arrays.asList(new DijkstraAlgorithm.Edge(4019, 1), new DijkstraAlgorithm.Edge(413, 1)));
        graph.put(413, Arrays.asList(new DijkstraAlgorithm.Edge(412, 1), new DijkstraAlgorithm.Edge(414, 1)));
        graph.put(414, Arrays.asList(new DijkstraAlgorithm.Edge(413, 1)));
        graph.put(445, Arrays.asList(new DijkstraAlgorithm.Edge(4018, 1), new DijkstraAlgorithm.Edge(446, 1)));
        graph.put(609, Arrays.asList(new DijkstraAlgorithm.Edge(608, 1)));
        graph.put(608, Arrays.asList(new DijkstraAlgorithm.Edge(631, 1), new DijkstraAlgorithm.Edge(609, 1)));
        graph.put(631, Arrays.asList(new DijkstraAlgorithm.Edge(608, 1), new DijkstraAlgorithm.Edge(630, 1)));
        graph.put(630, Arrays.asList(new DijkstraAlgorithm.Edge(631, 1), new DijkstraAlgorithm.Edge(611, 1), new DijkstraAlgorithm.Edge(629, 1), new DijkstraAlgorithm.Edge(4015, 10), new DijkstraAlgorithm.Edge(729, 10)));
        graph.put(611, Arrays.asList(new DijkstraAlgorithm.Edge(630, 1), new DijkstraAlgorithm.Edge(627, 1)));
        graph.put(629, Arrays.asList(new DijkstraAlgorithm.Edge(630, 1), new DijkstraAlgorithm.Edge(627, 1)));
        graph.put(627, Arrays.asList(new DijkstraAlgorithm.Edge(611, 1), new DijkstraAlgorithm.Edge(629, 1), new DijkstraAlgorithm.Edge(6001, 1)));
        graph.put(6001, Arrays.asList(new DijkstraAlgorithm.Edge(627, 1), new DijkstraAlgorithm.Edge(6002, 1), new DijkstraAlgorithm.Edge(615, 1)));
        graph.put(615, Arrays.asList(new DijkstraAlgorithm.Edge(6001, 1), new DijkstraAlgorithm.Edge(616, 1)));
        graph.put(616, Arrays.asList(new DijkstraAlgorithm.Edge(615, 1), new DijkstraAlgorithm.Edge(617, 1)));
        graph.put(617, Arrays.asList(new DijkstraAlgorithm.Edge(616, 1), new DijkstraAlgorithm.Edge(618, 1)));
        graph.put(618, Arrays.asList(new DijkstraAlgorithm.Edge(617, 1)));
        graph.put(6002, Arrays.asList(new DijkstraAlgorithm.Edge(6001, 1), new DijkstraAlgorithm.Edge(623, 1), new DijkstraAlgorithm.Edge(4016, 10), new DijkstraAlgorithm.Edge(7004, 10), new DijkstraAlgorithm.Edge(3007, 10)));
        graph.put(623, Arrays.asList(new DijkstraAlgorithm.Edge(6002, 1), new DijkstraAlgorithm.Edge(619, 1)));
        graph.put(619, Arrays.asList(new DijkstraAlgorithm.Edge(623, 1), new DijkstraAlgorithm.Edge(620, 1)));
        graph.put(620, Arrays.asList(new DijkstraAlgorithm.Edge(619, 1), new DijkstraAlgorithm.Edge(621, 1)));
        graph.put(621, Arrays.asList(new DijkstraAlgorithm.Edge(620, 1), new DijkstraAlgorithm.Edge(622, 1)));
        graph.put(622, Arrays.asList(new DijkstraAlgorithm.Edge(621, 1)));
        graph.put(6003, Arrays.asList(new DijkstraAlgorithm.Edge(605, 1)));
        graph.put(605, Arrays.asList(new DijkstraAlgorithm.Edge(6003, 1), new DijkstraAlgorithm.Edge(604, 1), new DijkstraAlgorithm.Edge(6020, 1)));
        graph.put(604, Arrays.asList(new DijkstraAlgorithm.Edge(605, 1), new DijkstraAlgorithm.Edge(6004, 1)));
        graph.put(6004, Arrays.asList(new DijkstraAlgorithm.Edge(604, 1), new DijkstraAlgorithm.Edge(603, 1), new DijkstraAlgorithm.Edge(602, 1)));
        graph.put(603, Arrays.asList(new DijkstraAlgorithm.Edge(6004, 1)));
        graph.put(602, Arrays.asList(new DijkstraAlgorithm.Edge(6004, 1), new DijkstraAlgorithm.Edge(6005, 1)));
        graph.put(6005, Arrays.asList(new DijkstraAlgorithm.Edge(602, 1), new DijkstraAlgorithm.Edge(6006, 1), new DijkstraAlgorithm.Edge(601, 1)));
        graph.put(6006, Arrays.asList(new DijkstraAlgorithm.Edge(6005, 1), new DijkstraAlgorithm.Edge(4021, 10), new DijkstraAlgorithm.Edge(7006, 10), new DijkstraAlgorithm.Edge(3002, 10)));
        graph.put(601, Arrays.asList(new DijkstraAlgorithm.Edge(6005, 1), new DijkstraAlgorithm.Edge(607, 1)));
        graph.put(607, Arrays.asList(new DijkstraAlgorithm.Edge(601, 1), new DijkstraAlgorithm.Edge(606, 1)));
        graph.put(606, Arrays.asList(new DijkstraAlgorithm.Edge(607, 1), new DijkstraAlgorithm.Edge(6020, 1)));
        graph.put(6020, Arrays.asList(new DijkstraAlgorithm.Edge(606, 1), new DijkstraAlgorithm.Edge(605, 1)));
        graph.put(711, Arrays.asList(new DijkstraAlgorithm.Edge(710, 1)));
        graph.put(710, Arrays.asList(new DijkstraAlgorithm.Edge(711, 1), new DijkstraAlgorithm.Edge(709, 1)));
        graph.put(709, Arrays.asList(new DijkstraAlgorithm.Edge(710, 1), new DijkstraAlgorithm.Edge(708, 1)));
        graph.put(708, Arrays.asList(new DijkstraAlgorithm.Edge(709, 1), new DijkstraAlgorithm.Edge(7001, 1)));
        graph.put(7001, Arrays.asList(new DijkstraAlgorithm.Edge(708, 1), new DijkstraAlgorithm.Edge(729, 1)));
        graph.put(729, Arrays.asList(new DijkstraAlgorithm.Edge(7001, 1), new DijkstraAlgorithm.Edge(7002, 1), new DijkstraAlgorithm.Edge(4015, 10), new DijkstraAlgorithm.Edge(630, 10)));
        graph.put(7002, Arrays.asList(new DijkstraAlgorithm.Edge(729, 1), new DijkstraAlgorithm.Edge(712, 1), new DijkstraAlgorithm.Edge(728, 1)));
        graph.put(712, Arrays.asList(new DijkstraAlgorithm.Edge(7002, 1), new DijkstraAlgorithm.Edge(713, 1)));
        graph.put(713, Arrays.asList(new DijkstraAlgorithm.Edge(712, 1), new DijkstraAlgorithm.Edge(714, 1)));
        graph.put(714, Arrays.asList(new DijkstraAlgorithm.Edge(713, 1)));
        graph.put(728, Arrays.asList(new DijkstraAlgorithm.Edge(7002, 1), new DijkstraAlgorithm.Edge(727, 1)));
        graph.put(727, Arrays.asList(new DijkstraAlgorithm.Edge(728, 1), new DijkstraAlgorithm.Edge(7003, 1)));
        graph.put(7003, Arrays.asList(new DijkstraAlgorithm.Edge(727, 1), new DijkstraAlgorithm.Edge(715, 1), new DijkstraAlgorithm.Edge(7004, 1)));
        graph.put(715, Arrays.asList(new DijkstraAlgorithm.Edge(7003, 1), new DijkstraAlgorithm.Edge(716, 1)));
        graph.put(716, Arrays.asList(new DijkstraAlgorithm.Edge(715, 1), new DijkstraAlgorithm.Edge(717, 1)));
        graph.put(717, Arrays.asList(new DijkstraAlgorithm.Edge(716, 1), new DijkstraAlgorithm.Edge(718, 1)));
        graph.put(718, Arrays.asList(new DijkstraAlgorithm.Edge(717, 1)));
        graph.put(7004, Arrays.asList(new DijkstraAlgorithm.Edge(7003, 1), new DijkstraAlgorithm.Edge(726, 1), new DijkstraAlgorithm.Edge(4016, 10), new DijkstraAlgorithm.Edge(6002, 10), new DijkstraAlgorithm.Edge(3007, 10)));
        graph.put(726, Arrays.asList(new DijkstraAlgorithm.Edge(719, 1), new DijkstraAlgorithm.Edge(725, 1), new DijkstraAlgorithm.Edge(7004, 1)));
        graph.put(719, Arrays.asList(new DijkstraAlgorithm.Edge(726, 1), new DijkstraAlgorithm.Edge(720, 1)));
        graph.put(720, Arrays.asList(new DijkstraAlgorithm.Edge(719, 1), new DijkstraAlgorithm.Edge(721, 1)));
        graph.put(721, Arrays.asList(new DijkstraAlgorithm.Edge(720, 1), new DijkstraAlgorithm.Edge(722, 1)));
        graph.put(722, Arrays.asList(new DijkstraAlgorithm.Edge(721, 1)));
        graph.put(725, Arrays.asList(new DijkstraAlgorithm.Edge(726, 1), new DijkstraAlgorithm.Edge(724, 1)));
        graph.put(724, Arrays.asList(new DijkstraAlgorithm.Edge(725, 1), new DijkstraAlgorithm.Edge(723, 1)));
        graph.put(723, Arrays.asList(new DijkstraAlgorithm.Edge(724, 1)));
        graph.put(7007, Arrays.asList(new DijkstraAlgorithm.Edge(705, 1)));
        graph.put(705, Arrays.asList(new DijkstraAlgorithm.Edge(7007, 1), new DijkstraAlgorithm.Edge(704, 1), new DijkstraAlgorithm.Edge(7009, 1)));
        graph.put(704, Arrays.asList(new DijkstraAlgorithm.Edge(705, 1), new DijkstraAlgorithm.Edge(7008, 1)));
        graph.put(7008, Arrays.asList(new DijkstraAlgorithm.Edge(703, 1), new DijkstraAlgorithm.Edge(702, 1), new DijkstraAlgorithm.Edge(704, 1)));
        graph.put(703, Arrays.asList(new DijkstraAlgorithm.Edge(7008, 1)));
        graph.put(702, Arrays.asList(new DijkstraAlgorithm.Edge(7008, 1), new DijkstraAlgorithm.Edge(7005, 1)));
        graph.put(7005, Arrays.asList(new DijkstraAlgorithm.Edge(7006, 1), new DijkstraAlgorithm.Edge(701, 1), new DijkstraAlgorithm.Edge(702, 1)));
        graph.put(7006, Arrays.asList(new DijkstraAlgorithm.Edge(7005, 1), new DijkstraAlgorithm.Edge(4021, 10), new DijkstraAlgorithm.Edge(6006, 10)));
        graph.put(701, Arrays.asList(new DijkstraAlgorithm.Edge(7005, 1), new DijkstraAlgorithm.Edge(707, 1)));
        graph.put(707, Arrays.asList(new DijkstraAlgorithm.Edge(701, 1), new DijkstraAlgorithm.Edge(706, 1)));
        graph.put(706, Arrays.asList(new DijkstraAlgorithm.Edge(707, 1), new DijkstraAlgorithm.Edge(7009, 1)));
        graph.put(7009, Arrays.asList(new DijkstraAlgorithm.Edge(706, 1), new DijkstraAlgorithm.Edge(705, 1)));
        graph.put(3002, Arrays.asList(new DijkstraAlgorithm.Edge(3001, 1), new DijkstraAlgorithm.Edge(4021, 10), new DijkstraAlgorithm.Edge(6006, 10)));
        graph.put(3001, Arrays.asList(new DijkstraAlgorithm.Edge(3002, 1), new DijkstraAlgorithm.Edge(333, 1), new DijkstraAlgorithm.Edge(334, 1)));
        graph.put(333, Arrays.asList(new DijkstraAlgorithm.Edge(3001, 1), new DijkstraAlgorithm.Edge(332, 1)));
        graph.put(332, Arrays.asList(new DijkstraAlgorithm.Edge(331, 1), new DijkstraAlgorithm.Edge(333, 1)));
        graph.put(331, Arrays.asList(new DijkstraAlgorithm.Edge(332, 1), new DijkstraAlgorithm.Edge(330, 1)));
        graph.put(330, Arrays.asList(new DijkstraAlgorithm.Edge(329, 1), new DijkstraAlgorithm.Edge(328, 1), new DijkstraAlgorithm.Edge(331, 1)));
        graph.put(329, Arrays.asList(new DijkstraAlgorithm.Edge(330, 1), new DijkstraAlgorithm.Edge(327, 1)));
        graph.put(328, Arrays.asList(new DijkstraAlgorithm.Edge(330, 1), new DijkstraAlgorithm.Edge(327, 1)));
        graph.put(327, Arrays.asList(new DijkstraAlgorithm.Edge(329, 1), new DijkstraAlgorithm.Edge(328, 1), new DijkstraAlgorithm.Edge(3004, 1)));
        graph.put(3004, Arrays.asList(new DijkstraAlgorithm.Edge(327, 1), new DijkstraAlgorithm.Edge(326, 1), new DijkstraAlgorithm.Edge(342, 1)));
        graph.put(326, Arrays.asList(new DijkstraAlgorithm.Edge(3004, 1), new DijkstraAlgorithm.Edge(325, 1)));
        graph.put(325, Arrays.asList(new DijkstraAlgorithm.Edge(326, 1), new DijkstraAlgorithm.Edge(324, 1)));
        graph.put(324, Arrays.asList(new DijkstraAlgorithm.Edge(325, 1), new DijkstraAlgorithm.Edge(3003, 1)));
        graph.put(3003, Arrays.asList(new DijkstraAlgorithm.Edge(324, 1), new DijkstraAlgorithm.Edge(335, 1), new DijkstraAlgorithm.Edge(301, 1)));
        graph.put(334, Arrays.asList(new DijkstraAlgorithm.Edge(3001, 1), new DijkstraAlgorithm.Edge(335, 1)));
        graph.put(335, Arrays.asList(new DijkstraAlgorithm.Edge(334, 1), new DijkstraAlgorithm.Edge(3003, 1)));
        graph.put(301, Arrays.asList(new DijkstraAlgorithm.Edge(3003, 1), new DijkstraAlgorithm.Edge(303, 1)));
        graph.put(303, Arrays.asList(new DijkstraAlgorithm.Edge(301, 1), new DijkstraAlgorithm.Edge(304, 1)));
        graph.put(304, Arrays.asList(new DijkstraAlgorithm.Edge(303, 1), new DijkstraAlgorithm.Edge(305, 1)));
        graph.put(305, Arrays.asList(new DijkstraAlgorithm.Edge(304, 1), new DijkstraAlgorithm.Edge(3005, 1)));
        graph.put(3005, Arrays.asList(new DijkstraAlgorithm.Edge(305, 1), new DijkstraAlgorithm.Edge(323, 1), new DijkstraAlgorithm.Edge(306, 1)));
        graph.put(323, Arrays.asList(new DijkstraAlgorithm.Edge(322, 1), new DijkstraAlgorithm.Edge(3005, 1)));
        graph.put(322, Arrays.asList(new DijkstraAlgorithm.Edge(323, 1), new DijkstraAlgorithm.Edge(321, 1)));
        graph.put(321, Arrays.asList(new DijkstraAlgorithm.Edge(322, 1), new DijkstraAlgorithm.Edge(340, 1)));
        graph.put(342, Arrays.asList(new DijkstraAlgorithm.Edge(3004, 1), new DijkstraAlgorithm.Edge(341, 1)));
        graph.put(341, Arrays.asList(new DijkstraAlgorithm.Edge(342, 1), new DijkstraAlgorithm.Edge(340, 1)));
        graph.put(340, Arrays.asList(new DijkstraAlgorithm.Edge(341, 1), new DijkstraAlgorithm.Edge(321, 1), new DijkstraAlgorithm.Edge(339, 1)));
        graph.put(339, Arrays.asList(new DijkstraAlgorithm.Edge(340, 1), new DijkstraAlgorithm.Edge(320, 1), new DijkstraAlgorithm.Edge(338, 1)));
        graph.put(320, Arrays.asList(new DijkstraAlgorithm.Edge(339, 1), new DijkstraAlgorithm.Edge(319, 1)));
        graph.put(319, Arrays.asList(new DijkstraAlgorithm.Edge(320, 1), new DijkstraAlgorithm.Edge(307, 1)));
        graph.put(306, Arrays.asList(new DijkstraAlgorithm.Edge(3005, 1), new DijkstraAlgorithm.Edge(307, 1)));
        graph.put(307, Arrays.asList(new DijkstraAlgorithm.Edge(306, 1), new DijkstraAlgorithm.Edge(308, 1)));
        graph.put(308, Arrays.asList(new DijkstraAlgorithm.Edge(307, 1), new DijkstraAlgorithm.Edge(309, 1)));
        graph.put(309, Arrays.asList(new DijkstraAlgorithm.Edge(308, 1), new DijkstraAlgorithm.Edge(3006, 1)));
        graph.put(3006, Arrays.asList(new DijkstraAlgorithm.Edge(309, 1), new DijkstraAlgorithm.Edge(317, 1), new DijkstraAlgorithm.Edge(310, 1)));
        graph.put(317, Arrays.asList(new DijkstraAlgorithm.Edge(3006, 1), new DijkstraAlgorithm.Edge(318, 1)));
        graph.put(318, Arrays.asList(new DijkstraAlgorithm.Edge(317, 1), new DijkstraAlgorithm.Edge(338, 1)));
        graph.put(338, Arrays.asList(new DijkstraAlgorithm.Edge(339, 1), new DijkstraAlgorithm.Edge(318, 1), new DijkstraAlgorithm.Edge(3007, 1)));
        graph.put(3007, Arrays.asList(new DijkstraAlgorithm.Edge(338, 1), new DijkstraAlgorithm.Edge(337, 1), new DijkstraAlgorithm.Edge(4016, 10), new DijkstraAlgorithm.Edge(6002, 10), new DijkstraAlgorithm.Edge(7004, 10)));
        graph.put(337, Arrays.asList(new DijkstraAlgorithm.Edge(3007, 1), new DijkstraAlgorithm.Edge(316, 1), new DijkstraAlgorithm.Edge(336, 1)));
        graph.put(336, Arrays.asList(new DijkstraAlgorithm.Edge(337, 1)));
        graph.put(316, Arrays.asList(new DijkstraAlgorithm.Edge(337, 1), new DijkstraAlgorithm.Edge(315, 1)));
        graph.put(315, Arrays.asList(new DijkstraAlgorithm.Edge(316, 1), new DijkstraAlgorithm.Edge(314, 1)));
        graph.put(314, Arrays.asList(new DijkstraAlgorithm.Edge(315, 1), new DijkstraAlgorithm.Edge(313, 1)));
        graph.put(313, Arrays.asList(new DijkstraAlgorithm.Edge(314, 1), new DijkstraAlgorithm.Edge(312, 1)));
        graph.put(312, Arrays.asList(new DijkstraAlgorithm.Edge(313, 1), new DijkstraAlgorithm.Edge(310, 1)));
        graph.put(310, Arrays.asList(new DijkstraAlgorithm.Edge(3006, 1), new DijkstraAlgorithm.Edge(312, 1), new DijkstraAlgorithm.Edge(311, 1)));
        graph.put(311, Arrays.asList(new DijkstraAlgorithm.Edge(310, 1)));
        graph.put(512, Arrays.asList(new DijkstraAlgorithm.Edge(511, 1)));
        graph.put(511, Arrays.asList(new DijkstraAlgorithm.Edge(512, 1), new DijkstraAlgorithm.Edge(510, 1)));
        graph.put(510, Arrays.asList(new DijkstraAlgorithm.Edge(511, 1), new DijkstraAlgorithm.Edge(509, 1)));
        graph.put(509, Arrays.asList(new DijkstraAlgorithm.Edge(510, 1), new DijkstraAlgorithm.Edge(527, 1)));
        graph.put(527, Arrays.asList(new DijkstraAlgorithm.Edge(509, 1), new DijkstraAlgorithm.Edge(5001, 1)));
        graph.put(5001, Arrays.asList(new DijkstraAlgorithm.Edge(527, 1), new DijkstraAlgorithm.Edge(5002, 1)));
        graph.put(5002, Arrays.asList(new DijkstraAlgorithm.Edge(5001, 1), new DijkstraAlgorithm.Edge(525, 1), new DijkstraAlgorithm.Edge(513, 1)));
        graph.put(525, Arrays.asList(new DijkstraAlgorithm.Edge(5002, 1), new DijkstraAlgorithm.Edge(524, 1), new DijkstraAlgorithm.Edge(516, 1)));
        graph.put(513, Arrays.asList(new DijkstraAlgorithm.Edge(5002, 1), new DijkstraAlgorithm.Edge(524, 1), new DijkstraAlgorithm.Edge(516, 1)));
        graph.put(524, Arrays.asList(new DijkstraAlgorithm.Edge(513, 1), new DijkstraAlgorithm.Edge(525, 1), new DijkstraAlgorithm.Edge(5003, 1)));
        graph.put(516, Arrays.asList(new DijkstraAlgorithm.Edge(513, 1), new DijkstraAlgorithm.Edge(525, 1), new DijkstraAlgorithm.Edge(5003, 1)));
        graph.put(5003, Arrays.asList(new DijkstraAlgorithm.Edge(516, 1), new DijkstraAlgorithm.Edge(524, 1), new DijkstraAlgorithm.Edge(523, 1)));
        graph.put(523, Arrays.asList(new DijkstraAlgorithm.Edge(5003, 1), new DijkstraAlgorithm.Edge(522, 1), new DijkstraAlgorithm.Edge(518, 1)));
        graph.put(522, Arrays.asList(new DijkstraAlgorithm.Edge(523, 1)));
        graph.put(518, Arrays.asList(new DijkstraAlgorithm.Edge(523, 1), new DijkstraAlgorithm.Edge(519, 1)));
        graph.put(519, Arrays.asList(new DijkstraAlgorithm.Edge(518, 1), new DijkstraAlgorithm.Edge(520, 1)));
        graph.put(520, Arrays.asList(new DijkstraAlgorithm.Edge(519, 1), new DijkstraAlgorithm.Edge(521, 1)));
        graph.put(521, Arrays.asList(new DijkstraAlgorithm.Edge(520, 1)));
        graph.put(5004, Arrays.asList(new DijkstraAlgorithm.Edge(5005, 1)));
        graph.put(5005, Arrays.asList(new DijkstraAlgorithm.Edge(5004, 1), new DijkstraAlgorithm.Edge(501, 1), new DijkstraAlgorithm.Edge(502, 1)));
        graph.put(501, Arrays.asList(new DijkstraAlgorithm.Edge(5005, 1), new DijkstraAlgorithm.Edge(508, 1)));
        graph.put(508, Arrays.asList(new DijkstraAlgorithm.Edge(501, 1), new DijkstraAlgorithm.Edge(507, 1)));
        graph.put(507, Arrays.asList(new DijkstraAlgorithm.Edge(508, 1), new DijkstraAlgorithm.Edge(506, 1), new DijkstraAlgorithm.Edge(5020, 1)));
        graph.put(506, Arrays.asList(new DijkstraAlgorithm.Edge(507, 1)));
        graph.put(5020, Arrays.asList(new DijkstraAlgorithm.Edge(507, 1), new DijkstraAlgorithm.Edge(505, 1)));
        graph.put(505, Arrays.asList(new DijkstraAlgorithm.Edge(5020, 1), new DijkstraAlgorithm.Edge(504, 1)));
        graph.put(504, Arrays.asList(new DijkstraAlgorithm.Edge(505, 1), new DijkstraAlgorithm.Edge(503, 1)));
        graph.put(503, Arrays.asList(new DijkstraAlgorithm.Edge(504, 1), new DijkstraAlgorithm.Edge(502, 1)));
        graph.put(502, Arrays.asList(new DijkstraAlgorithm.Edge(503, 1), new DijkstraAlgorithm.Edge(5005, 1)));
        System.out.println(graph.get(0));
    }

    public void findNewPath(Point point, Integer endPoint){
        Map<Integer, Integer> previous = DijkstraAlgorithm.dijkstra(graph, 4001);
        List<Integer> path = DijkstraAlgorithm.getPath(previous, endPoint);
        System.out.println("Path: " + path);
        point.setPath(path);
    }
}
