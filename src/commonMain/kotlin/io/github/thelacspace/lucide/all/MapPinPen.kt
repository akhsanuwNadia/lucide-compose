package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MapPinPen") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17.97f,9.304f)
                curveTo(17.599318f,5.0357704f,13.931909f,1.8172145f,9.651676f,2.0037544f)
                curveTo(5.3714433f,2.1902943f,1.9979477f,5.715705f,2.0f,10.0f)
                curveTo(2.0f,14.690001f,6.887f,19.562f,9.021999f,21.468f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.378f,16.626f)
                curveTo(22.201212f,15.795392f,22.198215f,14.45562f,21.371298f,13.628702f)
                curveTo(20.54438f,12.801784f,19.204609f,12.798788f,18.374f,13.622f)
                lineTo(14.364f,17.633999f)
                curveTo(14.126247f,17.87162f,13.952221f,18.165333f,13.858001f,18.487999f)
                lineTo(13.021001f,21.357998f)
                curveTo(12.969882f,21.533262f,13.0183525f,21.722456f,13.147447f,21.851551f)
                curveTo(13.276542f,21.980646f,13.465735f,22.029118f,13.641001f,21.977999f)
                lineTo(16.511002f,21.140999f)
                curveTo(16.833668f,21.046778f,17.12738f,20.872751f,17.365002f,20.634998f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,10.0f)
                curveTo(6.9951925f,11.074993f,7.5659356f,12.070391f,8.496114f,12.60928f)
                curveTo(9.426291f,13.148169f,10.573709f,13.148169f,11.503886f,12.60928f)
                curveTo(12.434065f,12.070391f,13.004807f,11.074993f,13.0f,10.0f)
                curveTo(13.004807f,8.925007f,12.434065f,7.9296093f,11.503886f,7.3907204f)
                curveTo(10.573709f,6.8518314f,9.426291f,6.8518314f,8.496114f,7.3907204f)
                curveTo(7.5659356f,7.9296093f,6.9951925f,8.925007f,7.0f,10.0f)
            }
}

public val LucideIcons.All.MapPinPenDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MapPinPen: ImageVector
    @Composable get() = MapPinPenDefinition.asImageVector()
