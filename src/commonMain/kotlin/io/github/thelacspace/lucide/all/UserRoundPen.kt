package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("UserRoundPen") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f,21.0f)
                curveTo(1.9997106f,18.373741f,3.2884474f,15.914602f,5.448154f,14.420311f)
                curveTo(7.607861f,12.926021f,10.363439f,12.586916f,12.821f,13.5130005f)
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
                moveTo(5.0f,8.0f)
                curveTo(4.991987f,9.791655f,5.943226f,11.450651f,7.4935226f,12.3488f)
                curveTo(9.043819f,13.246948f,10.956181f,13.246948f,12.506477f,12.3488f)
                curveTo(14.056774f,11.450651f,15.008013f,9.791655f,15.0f,8.0f)
                curveTo(15.008013f,6.2083454f,14.056774f,4.549349f,12.506477f,3.6512005f)
                curveTo(10.956181f,2.7530522f,9.043819f,2.7530522f,7.4935226f,3.6512005f)
                curveTo(5.943226f,4.549349f,4.991987f,6.2083454f,5.0f,8.0f)
            }
}

public val LucideIcons.All.UserRoundPenDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.UserRoundPen: ImageVector
    @Composable get() = UserRoundPenDefinition.asImageVector()
