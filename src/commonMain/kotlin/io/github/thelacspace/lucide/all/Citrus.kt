package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Citrus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.65999984741211,17.670000076293945)
                curveTo(21.880706787109375,17.880308151245117,22.002248764038086,18.17409896850586,21.994630813598633,18.478866577148438)
                curveTo(21.987010955810547,18.783634185791016,21.85093879699707,19.07098388671875,21.619998931884766,19.270000457763672)
                curveTo(16.84932518005371,23.19075584411621,9.881979942321777,22.85090446472168,5.515537261962891,18.484460830688477)
                curveTo(1.149094820022583,14.11801815032959,0.8092442154884338,7.150672912597656,4.730000019073486,2.380000114440918)
                curveTo(4.9324750900268555,2.151294469833374,5.220931529998779,2.017077922821045,5.526291847229004,2.009491205215454)
                curveTo(5.8316521644592285,2.0019047260284424,6.126417636871338,2.121631383895874,6.340000152587891,2.3400001525878906)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(19.649999618530273,15.65999984741211)
                curveTo(16.50205421447754,18.645519256591797,11.54811954498291,18.57774543762207,8.483025550842285,15.507226943969727)
                curveTo(5.41793155670166,12.436707496643066,5.3589186668396,7.482661247253418,8.350000381469727,4.340000152587891)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,10.0)
                lineTo(8.5,15.5)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,17.850000381469727)
                lineTo(14.0,10.0)
                lineTo(6.150000095367432,10.0)
            }
}

public val LucideIcons.All.CitrusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Citrus: ImageVector
    @Composable get() = CitrusDefinition.asImageVector()
