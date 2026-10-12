package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("UserPen") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.5f,15.0f)
                lineTo(7.0f,15.0f)
                curveTo(4.790861f,15.0f,3.0f,16.790861f,3.0f,19.0f)
                lineTo(3.0f,21.0f)
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
                moveTo(6.0f,7.0f)
                curveTo(5.99359f,8.433324f,6.7545805f,9.760521f,7.994818f,10.479039f)
                curveTo(9.235056f,11.197558f,10.764944f,11.197558f,12.005181f,10.479039f)
                curveTo(13.2454195f,9.760521f,14.00641f,8.433324f,14.0f,7.0f)
                curveTo(14.00641f,5.566676f,13.2454195f,4.239479f,12.005181f,3.5209603f)
                curveTo(10.764944f,2.8024418f,9.235056f,2.8024418f,7.994818f,3.5209603f)
                curveTo(6.7545805f,4.239479f,5.99359f,5.566676f,6.0f,7.0f)
            }
}

public val LucideIcons.All.UserPenDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.UserPen: ImageVector
    @Composable get() = UserPenDefinition.asImageVector()
