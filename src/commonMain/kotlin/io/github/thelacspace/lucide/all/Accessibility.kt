package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Accessibility") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0,4.0)
                curveTo(14.998397827148438,4.358330726623535,15.188645362854004,4.690130233764648,15.49870491027832,4.869760036468506)
                curveTo(15.80876350402832,5.049389362335205,16.19123649597168,5.049389362335205,16.50129508972168,4.869760036468506)
                curveTo(16.811355590820312,4.690130233764648,17.001602172851562,4.358330726623535,17.0,4.0)
                curveTo(17.001602172851562,3.6416690349578857,16.811355590820312,3.3098697662353516,16.50129508972168,3.1302402019500732)
                curveTo(16.19123649597168,2.950610399246216,15.80876350402832,2.950610399246216,15.49870491027832,3.1302402019500732)
                curveTo(15.188645362854004,3.3098697662353516,14.998397827148438,3.6416690349578857,15.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,19.0)
                lineTo(19.0,12.0)
                lineTo(13.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,8.0)
                lineTo(8.0,5.0)
                lineTo(13.5,8.0)
                lineTo(11.140000343322754,11.5)
            }
            lucidePath(strokeWidth) {
                moveTo(4.239999771118164,14.5)
                curveTo(3.663590908050537,16.385650634765625,4.249218463897705,18.43397331237793,5.735274791717529,19.729951858520508)
                curveTo(7.221330642700195,21.025930404663086,9.330269813537598,21.32752227783203,11.119999885559082,20.5)
            }
            lucidePath(strokeWidth) {
                moveTo(13.760000228881836,17.5)
                curveTo(14.336408615112305,15.614349365234375,13.750781059265137,13.566027641296387,12.264725685119629,12.270048141479492)
                curveTo(10.778669357299805,10.974069595336914,8.669730186462402,10.672478675842285,6.880000114440918,11.5)
            }
}

public val LucideIcons.All.AccessibilityDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Accessibility: ImageVector
    @Composable get() = AccessibilityDefinition.asImageVector()
