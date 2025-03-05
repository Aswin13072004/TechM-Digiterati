import axios from "axios";
import { Card, CardBody, CardFooter, Stack, Heading, Divider, Button, ButtonGroup, Text, Image, HStack, Flex, Grid, GridItem, SimpleGrid, Box } from '@chakra-ui/react'
import { useEffect, useState } from "react";

const GameCard = () => {
const [data, setData] = useState<any[]>([]);
useEffect(() => {
    const fetchData = async () => {
        let response = await axios.get("https://api.rawg.io/api/games?key=683ff4923f26427c8c0567ffe4ab471f");
        setData(response.data.results);
    };
    fetchData();
  }, []);
  return (
    <>
   <SimpleGrid columns={5}  >
  {data.map((games) => (
    <Box>
      <Card maxW='sm'  margin={'10px'} >
  <CardBody>
    <><Image
          src={games.background_image}
          alt='Green double couch with wooden legs'
          borderRadius='lg' minHeight={'200px'} width={'auto'}  />
          <Stack mt='6' spacing='3'>
              <Heading size='md'>{games.name}</Heading>
              <Text>
                  {games.released}
              </Text>
              <Text color='blue.600' fontSize='2xl'>
                 Rating: {games.rating}/ {games.rating_top}
              </Text>
          </Stack></>
  </CardBody>
  <Divider />
  <CardFooter>
    <ButtonGroup spacing='2'>
      <Button variant='solid' colorScheme='blue'>
        Buy now
      </Button>
      <Button variant='ghost' colorScheme='blue'>
        Add to cart
      </Button>
    </ButtonGroup>
  </CardFooter>
</Card>
</Box>
))};
</SimpleGrid>
</>
  )
}
//683ff4923f26427c8c0567ffe4ab471f

export default GameCard;
