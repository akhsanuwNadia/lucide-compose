package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LightbulbOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.799999237060547,11.199999809265137)
                curveTo(17.599998474121094,10.300000190734863,18.0,9.199999809265137,18.0,8.0)
                curveTo(17.99596405029297,5.795267105102539,16.783096313476562,3.770350694656372,14.841219902038574,2.7263309955596924)
                curveTo(12.89934253692627,1.6823112964630127,10.541315078735352,1.787391185760498,8.699999809265137,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(22.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.300000190734863,6.300000190734863)
                curveTo(5.572678565979004,8.113683700561523,6.051467418670654,10.188436508178711,7.5,11.5)
                curveTo(8.199999809265137,12.199999809265137,8.800000190734863,13.0,9.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,18.0)
                lineTo(15.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,22.0)
                lineTo(14.0,22.0)
            }
}

public val LucideIcons.All.LightbulbOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LightbulbOff: ImageVector
    @Composable get() = LightbulbOffDefinition.asImageVector()
