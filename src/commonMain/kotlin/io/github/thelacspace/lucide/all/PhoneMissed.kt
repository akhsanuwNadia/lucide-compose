package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PhoneMissed") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0,2.0)
                lineTo(22.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,2.0)
                lineTo(16.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(13.831999778747559,16.56800079345703)
                curveTo(14.257412910461426,16.76337242126465,14.761430740356445,16.63747215270996,15.045000076293945,16.26500129699707)
                lineTo(15.399999618530273,15.80000114440918)
                curveTo(15.777708053588867,15.296388626098633,16.370485305786133,15.0,17.0,15.0)
                lineTo(20.0,15.0)
                curveTo(21.104570388793945,15.0,22.0,15.895430564880371,22.0,17.0)
                lineTo(22.0,20.0)
                curveTo(22.0,21.104570388793945,21.104570388793945,22.0,20.0,22.0)
                curveTo(10.058874130249023,22.0,2.0,13.941125869750977,2.0,4.0)
                curveTo(2.0,2.895430564880371,2.895430564880371,2.0,4.0,2.0)
                lineTo(7.0,2.0)
                curveTo(8.104569435119629,2.0,9.0,2.895430564880371,9.0,4.0)
                lineTo(9.0,7.0)
                curveTo(9.0,7.629514694213867,8.703611373901367,8.222291946411133,8.199999809265137,8.600000381469727)
                lineTo(7.73199987411499,8.951000213623047)
                curveTo(7.35347318649292,9.240028381347656,7.231302738189697,9.755904197692871,7.440000057220459,10.184000015258789)
                curveTo(8.806680679321289,12.959866523742676,11.054425239562988,15.20479679107666,13.832000732421875,16.56800079345703)
            }
}

public val LucideIcons.All.PhoneMissedDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PhoneMissed: ImageVector
    @Composable get() = PhoneMissedDefinition.asImageVector()
