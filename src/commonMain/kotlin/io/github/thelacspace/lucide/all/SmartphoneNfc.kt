package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SmartphoneNfc") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0,6.0)
                lineTo(8.0,6.0)
                lineTo(9.0,6.0)
                lineTo(9.0,18.0)
                lineTo(8.0,18.0)
                lineTo(3.0,18.0)
                lineTo(2.0,18.0)
                lineTo(2.0,6.0)
                lineTo(3.0,6.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(13.0,8.319999694824219)
                curveTo(14.300467491149902,10.600995063781738,14.300467491149902,13.399004936218262,13.0,15.680000305175781)
            }
            lucidePath(strokeWidth) {
                moveTo(16.459999084472656,6.210000038146973)
                curveTo(18.492141723632812,9.802538871765137,18.492141723632812,14.19746208190918,16.459999084472656,17.790000915527344)
            }
            lucidePath(strokeWidth) {
                moveTo(19.90999984741211,4.099999904632568)
                curveTo(22.713001251220703,8.992768287658691,22.716806411743164,15.003686904907227,19.920000076293945,19.899999618530273)
            }
}

public val LucideIcons.All.SmartphoneNfcDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SmartphoneNfc: ImageVector
    @Composable get() = SmartphoneNfcDefinition.asImageVector()
