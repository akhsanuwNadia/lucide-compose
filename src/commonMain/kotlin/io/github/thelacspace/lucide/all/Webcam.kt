package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Webcam") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0,10.0)
                curveTo(3.98717999458313,12.866647720336914,5.509161472320557,15.521041870117188,7.989636421203613,16.958078384399414)
                curveTo(10.470111846923828,18.395116806030273,13.529888153076172,18.395116806030273,16.01036262512207,16.958078384399414)
                curveTo(18.4908390045166,15.521041870117188,20.012819290161133,12.866647720336914,20.0,10.0)
                curveTo(20.012819290161133,7.133352279663086,18.4908390045166,4.4789581298828125,16.01036262512207,3.0419209003448486)
                curveTo(13.529888153076172,1.6048834323883057,10.470111846923828,1.6048834323883057,7.989636421203613,3.0419209003448486)
                curveTo(5.509161472320557,4.4789581298828125,3.98717999458313,7.133352279663086,4.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,10.0)
                curveTo(8.995192527770996,11.074993133544922,9.565935134887695,12.070390701293945,10.496113777160645,12.60927963256836)
                curveTo(11.426291465759277,13.148168563842773,12.573708534240723,13.148168563842773,13.503886222839355,12.60927963256836)
                curveTo(14.434064865112305,12.070390701293945,15.004807472229004,11.074993133544922,15.0,10.0)
                curveTo(15.004807472229004,8.925006866455078,14.434064865112305,7.929609298706055,13.503886222839355,7.390720367431641)
                curveTo(12.573708534240723,6.851831436157227,11.426291465759277,6.851831436157227,10.496113777160645,7.390720367431641)
                curveTo(9.565935134887695,7.929609298706055,8.995192527770996,8.925006866455078,9.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,22.0)
                lineTo(17.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,22.0)
                lineTo(12.0,18.0)
            }
}

public val LucideIcons.All.WebcamDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Webcam: ImageVector
    @Composable get() = WebcamDefinition.asImageVector()
