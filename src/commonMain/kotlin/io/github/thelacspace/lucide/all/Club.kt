package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Club") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17.280000686645508,9.050000190734863)
                curveTo(17.935699462890625,6.801891326904297,17.095991134643555,4.3851318359375,15.187616348266602,3.027914047241211)
                curveTo(13.279241561889648,1.670696496963501,10.720759391784668,1.670696496963501,8.812384605407715,3.027914047241211)
                curveTo(6.9040093421936035,4.3851318359375,6.06430196762085,6.801891326904297,6.720000267028809,9.050000190734863)
                curveTo(4.236248970031738,9.407044410705566,2.309053659439087,11.399903297424316,2.0353963375091553,13.894219398498535)
                curveTo(1.761738896369934,16.38853645324707,3.2110095024108887,18.751834869384766,5.558266639709473,19.638900756835938)
                curveTo(7.905523777008057,20.525964736938477,10.555583000183105,19.711868286132812,12.0,17.65999984741211)
                curveTo(13.440874099731445,19.71761131286621,16.09273910522461,20.53754425048828,18.443523406982422,19.652284622192383)
                curveTo(20.794309616088867,18.76702308654785,22.246606826782227,16.401538848876953,21.972328186035156,13.904611587524414)
                curveTo(21.698049545288086,11.407682418823242,19.76689910888672,9.413858413696289,17.280000686645508,9.059999465942383)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,17.65999984741211)
                lineTo(12.0,22.0)
            }
}

public val LucideIcons.All.ClubDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Club: ImageVector
    @Composable get() = ClubDefinition.asImageVector()
