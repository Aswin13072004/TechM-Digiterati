import { HStack, Switch, useColorMode } from "@chakra-ui/react";
import { FaCloudMoon } from "react-icons/fa";

const DarkSwitch = () => {
  // hook for useColorMode
  let { colorMode, toggleColorMode } = useColorMode();
  return (
    <>
      <HStack >
        <Switch  colorScheme='teal' isChecked={colorMode == 'dark'} onChange={toggleColorMode}>
        </Switch>
        <FaCloudMoon/>
      </HStack>
    </>
  );
};
export default DarkSwitch;
