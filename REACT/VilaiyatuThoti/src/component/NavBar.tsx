import { HStack, Image } from "@chakra-ui/react";
import logo from "../assets/LogoCut.png";
import DarkSwitch from "./DarkSwitch";


const NavBar = () => {
  return (
    <>
      <HStack justifyContent={"space-between"} margin={"15px"}>
        <div>
          <HStack>
            <Image src={logo} boxSize="50px"></Image>
            <h1>Vilaiyatu Thoti</h1>
          </HStack>
        </div>
        <DarkSwitch />
      </HStack>
    </>
  );
};
export default NavBar;
