import { Grid, GridItem } from "@chakra-ui/react";
import ButtonComp from "./component/ButtonComp"
import NavBar from "./component/NavBar"
import GameCard from "./component/GameCard";


function App() {
  return (
    <>
    <Grid templateAreas={'"nav nav" "side main"'} >
            <GridItem area={"nav"} bg={'blackAlpha.100'}>
              <NavBar/>
            </GridItem>
            <GridItem area={"side"} bg={"yellow"}></GridItem>
            <GridItem area={"main"} bg={"black"}>
              <GameCard/>
            </GridItem>
    </Grid>
    <ButtonComp/>
    </>
  );
}
export default App
