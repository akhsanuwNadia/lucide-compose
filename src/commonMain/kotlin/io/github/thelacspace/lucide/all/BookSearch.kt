package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BookSearch") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0,22.0)
                lineTo(5.5,22.0)
                curveTo(4.123652458190918,21.993844985961914,3.011155366897583,20.876361846923828,3.011155366897583,19.5)
                curveTo(3.011155366897583,18.123638153076172,4.123652458190918,17.006155014038086,5.5,17.0)
                lineTo(10.000999450683594,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,22.0)
                lineTo(19.121000289916992,20.121999740600586)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,19.5)
                lineTo(3.0,4.5)
                curveTo(3.0,3.119288206100464,4.119287967681885,2.0,5.5,2.0)
                lineTo(18.0,2.0)
                curveTo(18.552284240722656,2.0,19.0,2.4477152824401855,19.0,3.0)
                lineTo(19.0,11.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,18.0)
                curveTo(13.995192527770996,19.074993133544922,14.565935134887695,20.070390701293945,15.496113777160645,20.60927963256836)
                curveTo(16.426292419433594,21.148168563842773,17.573707580566406,21.148168563842773,18.503887176513672,20.60927963256836)
                curveTo(19.434064865112305,20.070390701293945,20.00480842590332,19.074993133544922,20.0,18.0)
                curveTo(20.00480842590332,16.925006866455078,19.434064865112305,15.929609298706055,18.503887176513672,15.39072036743164)
                curveTo(17.573707580566406,14.851831436157227,16.426292419433594,14.851831436157227,15.496113777160645,15.39072036743164)
                curveTo(14.565935134887695,15.929609298706055,13.995192527770996,16.925006866455078,14.0,18.0)
            }
}

public val LucideIcons.All.BookSearchDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BookSearch: ImageVector
    @Composable get() = BookSearchDefinition.asImageVector()
