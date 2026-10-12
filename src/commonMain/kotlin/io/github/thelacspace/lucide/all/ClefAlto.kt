package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ClefAlto") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,4.0)
                lineTo(10.0,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,4.763999938964844)
                curveTo(15.223084449768066,3.670419454574585,17.097803115844727,3.7622289657592773,18.208181381225586,4.9700846672058105)
                curveTo(19.318559646606445,6.1779398918151855,19.25266456604004,8.053749084472656,18.06026840209961,9.18071174621582)
                curveTo(16.86787223815918,10.307674407958984,14.991332054138184,10.267708778381348,13.847999572753906,9.090999603271484)
                curveTo(13.360095024108887,10.812010765075684,11.788834571838379,11.999847412109375,10.0,12.0)
                curveTo(11.788834571838379,12.000152587890625,13.360095024108887,13.187989234924316,13.847999572753906,14.909000396728516)
                curveTo(14.991332054138184,13.732291221618652,16.86787223815918,13.692325592041016,18.06026840209961,14.81928825378418)
                curveTo(19.25266456604004,15.946250915527344,19.318559646606445,17.822059631347656,18.208181381225586,19.02991485595703)
                curveTo(17.097803115844727,20.23777198791504,15.223084449768066,20.329580307006836,14.0,19.236000061035156)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,4.0)
                lineTo(6.0,20.0)
            }
}

public val LucideIcons.All.ClefAltoDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ClefAlto: ImageVector
    @Composable get() = ClefAltoDefinition.asImageVector()
