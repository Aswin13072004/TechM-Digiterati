import { Button } from "@chakra-ui/react";
import { MdBuild , MdCall } from "react-icons/md"

const ButtonComp = () => {
    return <>
  <Button rightIcon={<MdCall />} colorScheme='blue' variant='outline'>
    Call us
  </Button>
    </>
};
export default ButtonComp;