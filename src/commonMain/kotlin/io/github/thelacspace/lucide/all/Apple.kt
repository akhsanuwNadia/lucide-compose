package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Apple") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,6.5279998779296875)
                lineTo(12.0,3.0)
                curveTo(12.0,2.4477152824401855,12.447714805603027,2.0,13.0,2.0)
                lineTo(13.0,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.23699951171875,21.0)
                curveTo(20.676231384277344,18.241535186767578,22.015602111816406,14.682219505310059,22.0,11.0)
                curveTo(21.99994659423828,8.633916854858398,20.60936737060547,6.488807201385498,18.44942855834961,5.522882461547852)
                curveTo(16.289487838745117,4.556957721710205,13.76357364654541,4.950611591339111,12.0,6.5279998779296875)
                curveTo(10.23642635345459,4.950611591339111,7.710511207580566,4.556957721710205,5.550572395324707,5.522882461547852)
                curveTo(3.3906333446502686,6.488807201385498,2.000053644180298,8.633916854858398,2.0,11.0)
                curveTo(1.9936902523040771,14.680542945861816,3.3318607807159424,18.236669540405273,5.763000011444092,21.0)
                curveTo(6.684402942657471,22.030807495117188,8.190958023071289,22.298419952392578,9.41100025177002,21.648000717163086)
                curveTo(11.029052734375,20.784711837768555,12.970948219299316,20.784711837768555,14.589000701904297,21.648000717163086)
                curveTo(15.809041976928711,22.298418045043945,17.315597534179688,22.030807495117188,18.23699951171875,21.0)
            }
}

public val LucideIcons.All.AppleDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Apple: ImageVector
    @Composable get() = AppleDefinition.asImageVector()
