package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MailSearch") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(22.0,12.5)
                lineTo(22.0,6.0)
                curveTo(22.0,4.895430564880371,21.104570388793945,4.0,20.0,4.0)
                lineTo(4.0,4.0)
                curveTo(2.895430564880371,4.0,2.0,4.895430564880371,2.0,6.0)
                lineTo(2.0,18.0)
                curveTo(2.0,19.100000381469727,2.9000000953674316,20.0,4.0,20.0)
                lineTo(11.5,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,7.0)
                lineTo(13.029999732971191,12.699999809265137)
                curveTo(12.400046348571777,13.094680786132812,11.599952697753906,13.094680786132812,10.969999313354492,12.699999809265137)
                lineTo(2.0,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,21.0)
                curveTo(19.074993133544922,21.00480842590332,20.070390701293945,20.434064865112305,20.60927963256836,19.503887176513672)
                curveTo(21.148168563842773,18.573707580566406,21.148168563842773,17.426292419433594,20.60927963256836,16.496112823486328)
                curveTo(20.070390701293945,15.565935134887695,19.074993133544922,14.995192527770996,18.0,15.0)
                curveTo(16.3483829498291,15.007386207580566,15.013386726379395,16.348365783691406,15.013386726379395,18.0)
                curveTo(15.013386726379395,19.651634216308594,16.3483829498291,20.992612838745117,18.0,21.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,18.0)
                curveTo(14.995192527770996,19.074993133544922,15.565935134887695,20.070390701293945,16.496112823486328,20.60927963256836)
                curveTo(17.426292419433594,21.148168563842773,18.573707580566406,21.148168563842773,19.503887176513672,20.60927963256836)
                curveTo(20.434064865112305,20.070390701293945,21.00480842590332,19.074993133544922,21.0,18.0)
                curveTo(21.00480842590332,16.925006866455078,20.434064865112305,15.929609298706055,19.503887176513672,15.39072036743164)
                curveTo(18.573707580566406,14.851831436157227,17.426292419433594,14.851831436157227,16.496112823486328,15.39072036743164)
                curveTo(15.565935134887695,15.929609298706055,14.995192527770996,16.925006866455078,15.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,22.0)
                lineTo(20.5,20.5)
            }
}

public val LucideIcons.All.MailSearchDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MailSearch: ImageVector
    @Composable get() = MailSearchDefinition.asImageVector()
