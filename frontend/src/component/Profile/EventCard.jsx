import {
  Card,
  CardActions,
  CardContent,
  CardMedia,
  IconButton,
  Typography,
} from "@mui/material";
import React from "react";
import DeleteIcon from "@mui/icons-material/Delete";

export const EventCard = () => {
  return (
    <div>
      <Card sx={{ width: 345 }}>
        <CardMedia
          sx={{ height: 345 }}
          image="https://cdn.pixabay.com/photo/2014/11/05/15/57/salmon-518032_1280.jpg"
        />
        <CardContent>
          <Typography variant="h5">Indian Fast Food</Typography>
          <Typography variant="body2">50% off on your first order</Typography>
          <div className="py-2 space-y-2">
            <p>{"Delhi"}</p>
            <p className="text-sm text-blue-500">August 7, 2024 12:00AM</p>
            <p className="text-sm text-red-500">August 8, 2024 12:00AM</p>
          </div>
        </CardContent>
        {false && <CardActions>
          <IconButton>
            <DeleteIcon />
          </IconButton>
        </CardActions>}
      </Card>
    </div>
  );
};
