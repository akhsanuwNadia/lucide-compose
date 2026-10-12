package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FilePenLine") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.364f,13.634f)
                curveTo(14.126247f,13.871622f,13.952221f,14.165335f,13.858001f,14.488f)
                lineTo(13.021001f,17.358f)
                curveTo(12.969882f,17.533264f,13.0183525f,17.722458f,13.147447f,17.851553f)
                curveTo(13.276542f,17.980648f,13.465735f,18.02912f,13.641001f,17.978f)
                lineTo(16.511002f,17.141f)
                curveTo(16.833668f,17.04678f,17.12738f,16.872753f,17.365002f,16.635f)
                lineTo(21.378002f,12.626f)
                curveTo(22.201214f,11.795393f,22.198217f,10.455621f,21.3713f,9.628703f)
                curveTo(20.544382f,8.8017845f,19.20461f,8.798789f,18.374002f,9.622001f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(14.487f,7.858f)
                curveTo(14.185065f,7.677554f,14.000137f,7.351746f,14.0f,7.0f)
                lineTo(14.0f,2.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,19.645f)
                lineTo(20.0f,20.0f)
                curveTo(20.0f,21.10457f,19.10457f,22.0f,18.0f,22.0f)
                lineTo(6.0f,22.0f)
                curveTo(4.8954306f,22.0f,4.0f,21.10457f,4.0f,20.0f)
                lineTo(4.0f,4.0f)
                curveTo(4.0f,2.8954306f,4.8954306f,2.0f,6.0f,2.0f)
                lineTo(14.0f,2.0f)
                curveTo(14.639365f,1.9989636f,15.252715f,2.2530863f,15.704f,2.7059999f)
                lineTo(18.220001f,5.222f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,18.0f)
                lineTo(9.0f,18.0f)
            }
}

public val LucideIcons.All.FilePenLineDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FilePenLine: ImageVector
    @Composable get() = FilePenLineDefinition.asImageVector()
