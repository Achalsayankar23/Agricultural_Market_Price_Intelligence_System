let districtName = "";

function findMarket() {
    const crop = document.getElementById("crop").value;
    districtName = document.getElementById("district").value;

    // Simple demo logic
    let market = districtName + " APMC Market";

    document.getElementById("rCrop").innerText = crop;
    document.getElementById("rMarket").innerText = market;

    document.getElementById("result").classList.remove("hidden");
}

function openMap() {
    const query = "APMC market near " + districtName;
    const url = "https://www.google.com/maps/search/" + encodeURIComponent(query);
    window.open(url, "_blank");
}
