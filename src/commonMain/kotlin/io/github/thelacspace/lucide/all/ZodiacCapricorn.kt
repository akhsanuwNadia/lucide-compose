package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ZodiacCapricorn") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0,21.0)
                curveTo(12.656854629516602,21.0,14.0,19.6568546295166,14.0,18.0)
                lineTo(14.0,6.5)
                curveTo(13.991382598876953,4.573112964630127,12.426905632019043,3.015617609024048,10.5,3.015617609024048)
                curveTo(8.573094367980957,3.015617609024048,7.008617401123047,4.573112964630127,7.0,6.5)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,19.0)
                lineTo(7.0,6.0)
                curveTo(7.0,4.343145847320557,5.656854152679443,3.0,4.0,3.0)
                lineTo(4.0,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,17.0)
                curveTo(13.995192527770996,18.074993133544922,14.565935134887695,19.070390701293945,15.496113777160645,19.60927963256836)
                curveTo(16.426292419433594,20.148168563842773,17.573707580566406,20.148168563842773,18.503887176513672,19.60927963256836)
                curveTo(19.434064865112305,19.070390701293945,20.00480842590332,18.074993133544922,20.0,17.0)
                curveTo(20.00480842590332,15.925006866455078,19.434064865112305,14.929609298706055,18.503887176513672,14.39072036743164)
                curveTo(17.573707580566406,13.851831436157227,16.426292419433594,13.851831436157227,15.496113777160645,14.39072036743164)
                curveTo(14.565935134887695,14.929609298706055,13.995192527770996,15.925006866455078,14.0,17.0)
            }
}

public val LucideIcons.All.ZodiacCapricornDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ZodiacCapricorn: ImageVector
    @Composable get() = ZodiacCapricornDefinition.asImageVector()
