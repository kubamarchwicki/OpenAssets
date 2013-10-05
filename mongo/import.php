<?php

require_once('ePF_API/ep_API.php');

error_reporting(0);
define("LIMIT", 100);

$searcher = new ep_Search();
$searcher->setDataset("poslowie_oswiadczenia_majatkowe");
$searcher->load(LIMIT);

$objects = $searcher->getObjects();

$p = $searcher->getPagination();

for($i = 1; $i<=((int)$p["total"]/LIMIT)+2; $i++) {

    foreach ($objects as $data) {
        $array = array();
        $array["id"] = $data->data["id"];
        $array["class"] = "ep_Posel_Oswiadczenie_Majatkowe";
        $array["data"]["data"] = substr($data->data["data"], 0, 10);
        $array["data"]["document_id"] = $data->data["dokument_id"];
        $array["data"]["id"] = $data->data["id"];
        $array["data"]["label"] = $data->data["label"];
        $array["data"]["posel_id"] = $data->data["posel_id"];
        echo json_encode($array);
       echo "\n";
    }
    
    $searcher->load(LIMIT, $i);
    $objects = $searcher->getObjects();
}
?>
