package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("HouseHeart") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8.62f,13.8f)
                curveTo(8.046981f,13.202571f,7.848297f,12.338742f,8.102722f,11.550999f)
                curveTo(8.357147f,10.763255f,9.023583f,10.178842f,9.837806f,10.029464f)
                curveTo(10.652029f,9.880086f,11.482515f,10.189872f,12.0f,10.836f)
                curveTo(12.5198765f,10.196737f,13.347599f,9.8927765f,14.157638f,10.043661f)
                curveTo(14.967676f,10.194545f,15.630448f,10.776137f,15.885297f,11.559707f)
                curveTo(16.140144f,12.343277f,15.946301f,13.203475f,15.38f,13.802f)
                lineTo(12.754f,16.658f)
                curveTo(12.564449f,16.876255f,12.289576f,17.001598f,12.0005f,17.001598f)
                curveTo(11.711424f,17.001598f,11.43655f,16.876255f,11.247f,16.658f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,10.0f)
                curveTo(2.9998589f,9.411126f,3.2592418f,8.852118f,3.709f,8.472f)
                lineTo(10.709f,2.4720001f)
                curveTo(11.454388f,1.8420277f,12.545611f,1.8420277f,13.290999f,2.4720001f)
                lineTo(20.291f,8.472f)
                curveTo(20.740759f,8.8521185f,21.000141f,9.411126f,21.0f,10.0f)
                lineTo(21.0f,19.0f)
                curveTo(21.0f,20.10457f,20.10457f,21.0f,19.0f,21.0f)
                lineTo(5.0f,21.0f)
                curveTo(3.8954306f,21.0f,3.0f,20.10457f,3.0f,19.0f)
                close()
            }
}

public val LucideIcons.All.HouseHeartDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.HouseHeart: ImageVector
    @Composable get() = HouseHeartDefinition.asImageVector()
