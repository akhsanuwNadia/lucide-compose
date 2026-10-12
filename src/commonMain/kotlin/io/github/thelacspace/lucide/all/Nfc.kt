package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Nfc") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0,8.319999694824219)
                curveTo(7.300467491149902,10.600995063781738,7.300467491149902,13.399004936218262,6.0,15.680000305175781)
            }
            lucidePath(strokeWidth) {
                moveTo(9.460000038146973,6.210000038146973)
                curveTo(11.492143630981445,9.802538871765137,11.492143630981445,14.19746208190918,9.460000038146973,17.790000915527344)
            }
            lucidePath(strokeWidth) {
                moveTo(12.90999984741211,4.099999904632568)
                curveTo(15.71300220489502,8.992768287658691,15.716806411743164,15.003686904907227,12.920000076293945,19.899999618530273)
            }
            lucidePath(strokeWidth) {
                moveTo(16.3700008392334,2.0)
                curveTo(19.90997886657715,8.196737289428711,19.90997886657715,15.803262710571289,16.3700008392334,22.0)
            }
}

public val LucideIcons.All.NfcDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Nfc: ImageVector
    @Composable get() = NfcDefinition.asImageVector()
